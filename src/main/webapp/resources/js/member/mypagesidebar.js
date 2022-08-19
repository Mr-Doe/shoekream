/**
 * Author : Mr.Doe
 * mypagesidebar.jsp 에 추가된 '설정'을 클릭시 발생하는 이벤트 추가.
 */

document.querySelectorAll('.snb_menu .menu_link').forEach((idx)=>{
    idx.addEventListener('click', (e)=> {
        const clicked = e.target;

        if(clicked.tagName == 'A') {
            if(clicked.closest('ul').classList.contains('list-group')) {
                console.log(clicked.style);
            }
        }

        if(clicked.id == 'operation_config') {
            e.preventDefault();
            const content = document.querySelector('.content_area');
            spreadAdminList();
            document.querySelectorAll('.snb_menu .menu_link').forEach((idx)=> {
                idx.style.color = '';
                idx.style.fontSize = '';
                idx.style.fontWeight = '';
            });

            const here = document.getElementById('operation_config');
            here.style.color = 'black';
            here.style.fontSize = '18px';
            here.style.fontWeight = 700;
        }
    });
});

document.querySelectorAll('.list-group .list-group-item a').forEach((idx)=>{
    idx.addEventListener('click', (e)=> {
        e.preventDefault();
        const clicked = e.target;
        console.log(clicked.tagName, clicked.innerText);
        console.log('test');
    });
});

function selected_tab_menu() {
    const location = window.location.pathname;

    if(location.includes('/mypage')) {
        const here = document.getElementById('mypage');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if(location.includes('/buying')) {
        const here = document.getElementById('buying');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if(location.includes('/selling')) {
        const here = document.getElementById('selling');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    } else if(location.includes('/detail')) {
        const here = document.getElementById('detail');
        here.style.color = 'black';
        here.style.fontSize = '18px';
        here.style.fontWeight = 700;
    }
}


// edit by sang hyun 08/19
document.addEventListener('click', (e) => {
    if(e.target.id('delBtn')){

    }
});
async function getListFromServer(pageNo=1){
    try {
      const resp = await fetch('/product/adminList');
      const productDTO = await resp.json();
      return productDTO;
    } catch (error) {
      console.log(error);
    }
}

function spreadAdminList(pageNo){
    getListFromServer(pageNo).then (result => {
        console.log(result);
        const content = document.querySelector('.content_area');
        const pageHandler = result.pagehdlr;
        const productList = result.productList;
        html = `<h3>관리자 모드</h3>`;
        html += `<ul class="list-group list-group-flush">`;
        productList.forEach(productVO => {
            html += `<li class="list-group-item">${productVO.pno}. ${productVO.brandName} - ${productVO.kName}
            <div class="btn-group float-right" role="group" aria-label="Basic mixed styles example">
            <button type="button" class="btn btn-${productVO.activate == 'Y' ? 'warning' : 'outline-warning' }" id="activeBtn">${productVO.activate == 'Y' ? '비활성화' : '활성화' }</button>
            <button type="button" class="btn btn-secondary">수정</button>
            <button class="btn btn-danger" id="delBtn">삭제</button>
          </div></li>`;
        });
        html += `</ul>`;
        content.innerHTML = html;
    });
}
