document.addEventListener('DOMContentLoaded', function () {
    if (document.getElementById('grade').innerText != '99') {
        alert('권한이 없습니다');
        window.location.href = '/';
    }
});
document.addEventListener('click', (e) => {
    if(e.target.id == 'modBtn'){
        window.location.href='/product/modify';
    }
    if(e.target.id == 'delBtn'){
        
    }
});

async function remove(pno){
    
}

// 배껴온것
document.getElementById('productRemove').addEventListener('click', (e) => {
    e.preventDefault();
    const pnoVal = document.getElementById('pnoVal').innerText;
    document.getElementById('pno').value = pnoVal;
    const delForm = document.getElementById('productRmForm');
    delForm.setAttribute('action', '/product/remove');
    delForm.submit();
  });