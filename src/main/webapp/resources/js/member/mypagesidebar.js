/**
 * Author : Mr.Doe
 * mypagesidebar.jsp 에 추가된 '설정'을 클릭시 발생하는 이벤트 추가.
 */

 document.getElementById('operation_config').addEventListener('click', (e)=> {
    e.preventDefault();

    const content = document.querySelector('.content_area');

    html = `
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><a href="#">First item</a></li>
                <li class="list-group-item"><a href="#">Second item</a></li>
                <li class="list-group-item"><a href="#">Third item</a></li>
                <li class="list-group-item"><a href="#">Fourth item</a></li>
            </ul>
        `;

    content.innerHTML = html;
});

document.addEventListener('click', (e)=> {
    const clicked = e.target;

    if(clicked.tagName == 'A') {
        if(clicked.closest('ul').classList.contains('list-group')) {
            console.log('tets');
        }
    }
});