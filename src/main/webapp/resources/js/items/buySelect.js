document.addEventListener('DOMContentLoaded', function() {
    if(document.getElementById('email').innerText=='') {
        document.getElementById('link').click();
    }
});

document.addEventListener('click', (e) => {
    if(e.target.classList.contains('select_link') || e.target.classList.contains('size') || e.target.classList.contains('price')){
        e.target.closest('ul').querySelectorAll('li').forEach(li => {
            if(li.classList.contains('active')) {
                li.classList.remove('active');
            }
        });
        e.target.closest('li').classList.add('active');
        document.getElementById('shoeSize').innerText = e.target.closest('li').dataset.size;
        let buyPrice = e.target.closest('button').querySelector('.price').innerText;
        document.querySelector('.order_price').innerText = buyPrice=='구매입찰' ? '구매입찰': buyPrice;
        document.querySelector('.order_btn_area').style.display = 'block';
    }

    if(e.target.classList.contains('box') || e.target.classList.contains('order_price')) {
        e.preventDefault();
        document.getElementById('buyBtn').href = `/items/buyItem?pno=${document.getElementById('pno').innerText}&email=${document.getElementById('email').innerText}&shoeSize=${document.getElementById('shoeSize').innerText}`;
        document.getElementById('buyBtn').click();
    }
});