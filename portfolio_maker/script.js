function updatePreview() {
  const fileInput = document.getElementById('photo');
  const name = document.getElementById('name').value.trim();
  const title = document.getElementById('title').value.trim();
  const bio = document.getElementById('bio').value.trim();
  const education = document.getElementById('education').value.trim();
  const experience = document.getElementById('experience').value.trim();
  const projects = document.getElementById('projects').value.trim();
  const skills = document.getElementById('skills').value.trim();
  const linkedin = document.getElementById('linkedin').value.trim();
  const github = document.getElementById('github').value.trim();

  let skillsHTML = '';
  if (skills) {
    const skillArr = skills.split(',').map(s => s.trim()).filter(Boolean);
    if (skillArr.length) {
      skillsHTML = `<div class="skills"><strong>Skills:</strong> ${skillArr.join(', ')}</div>`;
    }
  }

  let linksHTML = '';
  if (linkedin) linksHTML += `<a href="${linkedin}" target="_blank">LinkedIn</a>`;
  if (github) linksHTML += `<a href="${github}" target="_blank">GitHub</a>`;

  let educationHTML = education ? `<div class="section"><strong>Education:</strong> ${education}</div>` : '';
  let experienceHTML = experience ? `<div class="section"><strong>Work Experience:</strong><br>${experience.replace(/\n/g, '<br>')}</div>` : '';
  let projectsHTML = projects ? `<div class="section"><strong>Projects:</strong><br>${projects.replace(/\n/g, '<br>')}</div>` : '';

  if (fileInput.files && fileInput.files[0]) {
    const reader = new FileReader();
    reader.onload = function(e) {
      renderPortfolio(e.target.result);
    };
    reader.readAsDataURL(fileInput.files[0]);
  } else {
    renderPortfolio();
  }

  function renderPortfolio(photoSrc) {
    document.getElementById('portfolioPreview').innerHTML = `
      ${photoSrc ? `<img src="${photoSrc}" alt="Profile Photo">` : ''}
      <h2>${name || 'Your Name'}</h2>
      <h4>${title || 'Your Profession'}</h4>
      <div class="bio">${bio || 'Short bio will appear here.'}</div>
      ${educationHTML}
      ${experienceHTML}
      ${projectsHTML}
      ${skillsHTML}
      ${linksHTML ? `<div class="links">${linksHTML}</div>` : ''}
    `;
  }
}

// Live updates
document.querySelectorAll('#portfolioForm input, #portfolioForm textarea')
  .forEach(field => field.addEventListener('input', updatePreview));
document.getElementById('photo').addEventListener('change', updatePreview);

// Download portfolio as HTML
document.getElementById('downloadBtn').addEventListener('click', function () {
  const portfolioContent = document.getElementById('portfolioPreview').outerHTML;
  const fullHTML = `
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Portfolio</title>
<style>
  body { font-family: Arial, sans-serif; background: #f7f8fa; padding: 20px; }
  .portfolio { background: #fff; padding: 20px; border-radius: 10px; max-width: 700px; margin: auto; }
  .portfolio img { max-width: 150px; border-radius: 50%; margin-bottom: 15px; }
  a { color: #377dff; }
</style>
</head>
<body>
${portfolioContent}
</body>
</html>
`;
  const blob = new Blob([fullHTML], { type: "text/html" });
  const url = URL.createObjectURL(blob);
  const a = document.createElement('a');
  a.href = url;
  a.download = "portfolio.html";
  document.body.appendChild(a);
  a.click();
  document.body.removeChild(a);
  URL.revokeObjectURL(url);
});
