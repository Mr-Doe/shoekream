
const regExpPrevent = new RegExp("\.(exe|sh|bat|js|msi|dll)$"); // 실행파일 막기
const regExpImage = new RegExp("\.(jpg|jpeg|png|gif|JPG|JPEG|PNG|GIF)$"); // 이미지 파일만 허용
const maxSize = 3 * 1024 * 1024; // 3MB
function fileSizeAndTypeValidation(fileName, fileSize){
    if(regExpPrevent.test(fileName)){
      return 0;  
    } else if(!regExpImage.test(fileName)){
        return 0;
    } else if(fileSize > maxSize){
        return 0;
    } else {
        return 1;
    }
}

document.addEventListener('change', (e) => {    
    if(e.target.id == 'files') {
        document.getElementById('registerBtn').disabled = false;
        // input type file element에 저장된 file 정보를 가져오는 property, 리턴은 객체형
        const fileObjects = document.getElementById('files').files;
        console.log(fileObjects);

        let div = document.getElementById('fileZone');
        div.innerHTML = '';
        div.innerHTML = '<h1>insert</h1>';
        let ul = '<ul class="list-group list-group-flush">';

        let isOk = 1;
        for (const file of fileObjects) {
            let vaildFile = fileSizeAndTypeValidation(file.name, file.size);
            isOk *= vaildFile;
            ul += `<li class="${vaildFile ? "bg-success text-white":"bg-danger text-white"} list-group-item d-flex justify-content-between align-items-start">`;
            ul += `<div class="ms-2 me-auto">${file.name}</div>`;
            ul += `<span class="badge bg-primary rounded-pill">${file.size}</span></li>`;
        }
        ul += '</ul>';
        div.innerHTML = ul;
        if(!isOk){
            document.getElementById('registerBtn').disabled = true;
        }
    }
});

var selectBrandId = document.getElementById('selectBrand');
var selectCategoryId = document.getElementById('selectCategory');
document.addEventListener('change', (e) => {
    if(e.target.id == 'selectBrand'){
        document.getElementsByName('brand')[0].value = selectBrandId.options[selectBrandId.selectedIndex].value; 
        console.log("브랜드 id: "+document.getElementsByName('brand').value);
    }
    if(e.target.id == 'selectCategory'){
        document.getElementsByName('category')[0].value = selectCategoryId.options[selectCategoryId.selectedIndex].value; 
        console.log("카테고리 id: "+document.getElementsByName('category').value);
    }
});

    
    
