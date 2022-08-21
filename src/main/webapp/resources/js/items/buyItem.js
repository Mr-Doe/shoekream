let bidPriceRange = '';
let price = parseInt(document.getElementById('price').innerText);

document.addEventListener('DOMContentLoaded', function() {
    if(document.getElementById('email').innerText=='') {
        document.getElementById('link').click();
    }
    if(price==0 || price==30000) {
        bidPriceRange = '입찰 최소값은 30000원입니다.';
    } else {
        bidPriceRange = `입찰가는 30000원 이상 ${price}원 미만입니다.`
    }
    console.log(bidPriceRange);
    if(document.getElementById('itemNo').innerText!=0) {
        spreadDealArea();
    } else {
        spreadBidArea();
    }
});

document.addEventListener('click', (e) => {
    if(e.target.classList.contains('item_link')) {
        e.preventDefault();
        if(document.getElementById('itemNo').innerText!=0) {
            e.target.closest('ul').querySelector('.on').classList.remove('on');
            if(e.target.id=='bid') {
                spreadBidArea();
            } else if(e.target.id=='buy'){
                spreadDealArea();
            }
        }
    }
    if(e.target.classList.contains('input_amount')) {
        document.querySelector('.price_now').classList.add('on_focus');
    } else {
        document.querySelector('.price_now').classList.remove('on_focus');
    }
});

document.addEventListener('change', () => {
    if(document.getElementById('itemNo').innerText!=0 && document.getElementById('type').innerText=='0') {
        if(parseInt(document.querySelector('.input_amount').value)>=parseInt(document.getElementById('price').innerText)) {
            document.querySelector('.on').classList.remove('on');
            spreadDealArea();
        }
    }
});

document.addEventListener('keyup', (e) => {
    if(parseInt(document.querySelector('.input_amount').value)<30000 || document.querySelector('.input_amount').value=='' || (parseInt(document.querySelector('.input_amount').value)>=price && price!=0)) {
        document.querySelector('.price_now').classList.add('has_danger', 'has_warning');
        document.querySelector('.price_warning').style.display = 'block';
        document.getElementById('btn').disabled = true;
    } else if(parseInt(document.querySelector('.input_amount').value)>=30000) {
        document.querySelector('.price_now').classList.remove('has_danger', 'has_warning');
        document.querySelector('.price_warning').style.display = 'none';
        document.getElementById('btn').disabled = parseInt(document.getElementById('price').innerText)==0 ? false : (parseInt(document.querySelector('.input_amount').value)>=parseInt(document.getElementById('price').innerText)) ? true : false;
    }
});

document.getElementById('btn').addEventListener('click', () => {
    if(document.getElementById('type').innerText==0) {
        document.getElementById('priceValue').value = document.querySelector('.input_amount').value;
        document.querySelector('form').action = '/items/buyBid';
        document.querySelector('form').submit();
        alert('구매 입찰 등록');
    } else if(document.getElementById('type').innerText==1) {
        if(document.getElementById('sellerEmail').innerText!=document.getElementById('email').innerText) {
            document.querySelector('form').action = '/items/buyItem';
            document.querySelector('form').submit();
            alert('즉시 구매 완료');
        } else {
            document.getElementById('link').href = `/items/detail?pno=${document.getElementsByName('pno')[0].value}`;
            document.getElementById('link').click();
            alert('즉시 구매 실패 \n사유 \nerror: 자신의 아이템과 매칭이 되었습니다');
        }
    }
});

function spreadDealArea() {
    document.querySelector('.tab_list').querySelectorAll('li')[1].classList.add('on');
    let html = '<div data-v-03750f89="" data-v-158ed304="" class="price_now"><dl data-v-03750f89="" class="price_now_box">';
    html += '<dt data-v-03750f89="" class="price_now_title">즉시 구매가</dt><dd data-v-03750f89="" class="price">';
    html += `<span data-v-03750f89="" class="amount">${document.getElementById('price').innerText }</span><span data-v-03750f89="" class="unit">원</span></dd></dl>`;
    html += '<div data-v-03750f89="" class="price_warning"></div></div>';
    document.getElementById('area').innerHTML = html;
    document.getElementById('btn').innerText = '즉시 구매 계속';
    document.getElementById('btn').disabled = false;
    document.getElementById('type').innerText = '1';
}

function spreadBidArea() {
    document.querySelector('.tab_list').querySelectorAll('li')[0].classList.add('on');
    let html = '<div data-v-03750f89="" data-v-158ed304="" class="price_now active_input has_danger has_warning"><dl data-v-03750f89="" class="price_now_box">';
	html += '<dt data-v-03750f89="" class="price_now_title">구매 희망가</dt><dd data-v-03750f89="" class="price">';
    html += '<input data-v-03750f89="" type="text" pattern="([0-9]+.{0,1}[0-9]*,{0,1})*[0-9]" required="required" placeholder="희망가 입력" autocomplete="off" class="input_amount">';
    html += '<span data-v-03750f89="" class="unit">원</span></dd></dl><div data-v-03750f89="" class="price_warning" style="display: block;">'
    html += `<p data-v-03750f89="" style="color: #f15746; line-height: 17px; font-size: 13px;">${bidPriceRange}</p></div></div>`;
    document.getElementById('area').innerHTML = html;
    document.getElementById('btn').innerText = '구매 입찰 계속';
    document.getElementById('btn').disabled = true;
    document.getElementById('type').innerText = '0';
}