document.addEventListener('DOMContentLoaded', function() {
    if(document.getElementById('email').innerText=='') {
        document.getElementById('link').click();
    }
});

document.querySelectorAll('.select_link, .size, .price').forEach((price) =>{
    price.addEventListener('click', (e) => {
        e.target.closest('ul').querySelectorAll('li').forEach(li => {
            if(li.classList.contains('active')) {
                li.classList.remove('active');
            }
        });

        if (e.target.closest('li').classList.contains('select_item')) {
            e.target.closest('li').classList.add('active');

            document.getElementById('order_price').innerText = e.target.closest('li').querySelector('.price').innerText;
            document.getElementById('order_btn_area').style.display = 'block';
            document.getElementById('shoeSize').innerText = e.target.closest('li').dataset.size;
        }
    });
});

document.addEventListener('click', (e) => {
    if(e.target.classList.contains('box') || e.target.classList.contains('order_price')) {
        e.preventDefault();
        document.getElementById('sellBtn').href += `&shoeSize=${document.getElementById('shoeSize').innerText}`;
        document.getElementById('sellBtn').click();
    }
});