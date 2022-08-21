document.addEventListener('DOMContentLoaded', function () {
    if (document.getElementById('grade').innerText != '99') {
        alert('권한이 없습니다');
        window.location.href = '/';
    }
});

const product = document.querySelectorAll('.purchase_item');
console.log(product);
for (let i = 0; i < product.length; i++) {
    product[i].setAttribute('onclick', `window.location.href="/product/modify?pno=${product[i].dataset.pno}"`)
}

