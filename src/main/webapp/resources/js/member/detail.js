document.addEventListener('DOMContentLoaded', emailCheckForAccess(session));

document.getElementById('memberRemove').addEventListener('click', (e) => {
  e.preventDefault();
  const emailVal = document.getElementById('emVal').value;
  document.getElementById('em').value = emailVal;
  const delForm = document.getElementById('memberRmForm');
  delForm.setAttribute('action', '/member/remove');
  delForm.submit();
});

function emailCheckForAccess(session) {
  let pathEmail = window.location.href;
  let hrefEmail = '';

  if (pathEmail.includes('?')) {
      hrefEmail = pathEmail.substring(pathEmail.lastIndexOf('=')+1, pathEmail.length);
  }

  console.log(hrefEmail);

  if (hrefEmail != '') {
      if (session != hrefEmail) {
          if (window.location.pathname == "adminList") {
            window.location.href = "/product/adminList";
          } else {
            alert('잘못된 접근입니다!')
            window.location.href = "/";
          }
      }
  }
}