document.addEventListener('DOMContentLoaded', function () {
    if (document.getElementById('email').innerText == '') {
        document.getElementById('link').click();
    }

    if (document.getElementById('itemNo').innerText != '') {
        spreadDealArea();
    } else {
        spreadBidArea();
    }
});

document.addEventListener('click', (e) => {
    if (e.target.classList.contains('item_link')) {
        e.preventDefault();
        if (document.getElementById('itemNo').innerText != '') {
            e.target.closest('ul').querySelector('.on').classList.remove('on');
            if (e.target.id == 'bid') {
                spreadBidArea();
            } else if (e.target.id == 'sell') {
                spreadDealArea();
            }
        }
    };
    
});

document.addEventListener('change', (e) => {
    if(e.target.id == 'bid_price'){
        if (document.getElementById('itemNo').innerText != '' && document.getElementById('type').innerText == '0') {
            if (parseInt(e.target.value) >= 30000 && parseInt(e.target.value) <= parseInt(document.getElementById('sellPrice').innerText)) {
                document.querySelector('.on').classList.remove('on');
                spreadDealArea();
            } 
        } 
    } 
});

document.addEventListener('keyup', (e) => {
    if(e.target.id == 'bid_price'){
        if(parseInt(e.target.value) < 30000){
            document.querySelector('.price_now').classList.add('has_danger', 'has_warning');
            document.querySelector('.price_warning').style.display = 'block';
            document.getElementById('btn').disabled = true;
        } else if(parseInt(e.target.value) >= 30000){
            document.querySelector('.price_now').classList.remove('has_danger', 'has_warning');
            document.querySelector('.price_warning').style.display = 'none';

            if(document.getElementById('type').innerText == '0'){
                if(document.getElementById('itemNo').innerText == ''){
                    document.getElementById('btn').disabled = false;
                } else if(document.getElementById('itemNo').innerText != '' && parseInt(e.target.value) > parseInt(document.getElementById('sellPrice').innerText)){
                    document.getElementById('btn').disabled = false;
                }
            }
        }
    }
});

function spreadDealArea() {
    document.getElementById('panel2').classList.add('on');
    let html = `<div data-v-03750f89="" data-v-158ed304="" class="price_now">
                <dl data-v-03750f89="" class="price_now_box">
                <dt data-v-03750f89="" class="price_now_title">즉시 판매가</dt>
                <dd data-v-03750f89="" class="price">
                <span data-v-03750f89="" class="amount" >${document.getElementById('sellPrice').innerText }</span><span data-v-03750f89="" class="unit">원</span>
                </dd></dl></div>`;
    document.getElementById('area').innerHTML = html;
    document.getElementById('btn').innerText = '즉시 판매 계속';
    document.getElementById('btn').disabled = false;
    document.getElementById('type').innerText = '1';
}

function spreadBidArea() {
    document.getElementById('panel1').classList.add('on');
    let html = `<div data-v-03750f89="" data-v-158ed304="" class="price_now active_input has_danger has_warning">
                <dl data-v-03750f89="" class="price_now_box">
                    <dt data-v-03750f89="" class="price_now_title">판매 희망가</dt>
                    <dd data-v-03750f89="" class="price">
                <input data-v-03750f89="" type="text" required="required" placeholder="희망가 입력" autocomplete="off" class="input_amount"
                id="bid_price">
                <span data-v-03750f89="" class="unit">원</span></dd></dl>
                <div data-v-03750f89="" class="price_warning">
                <p data-v-03750f89="" style="color: #f15746; line-height: 17px; font-size: 13px;"> 입찰 최소값은 3만원입니다. </p></div></div>`;
    document.getElementById('area').innerHTML = html;
    document.getElementById('btn').innerText = '판매 입찰 계속';
    document.getElementById('btn').disabled = true;
    document.getElementById('type').innerText = '0';
}