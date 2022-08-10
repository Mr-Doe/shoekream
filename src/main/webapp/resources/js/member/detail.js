document.getElementById('memberRemove').addEventListener('click', (e) => {
    e.preventDefault();
    const emailVal = document.getElementById('emVal').value;
    document.getElementById('em').value = emailVal;
    const delForm = document.getElementById('memberRmForm');
    delForm.setAttribute('action', '/member/remove');
    delForm.submit();
  });