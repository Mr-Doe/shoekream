document.addEventListener('DOMContentLoaded', function () {
    if (document.getElementById('grade').innerText != '99') {
        alert('권한이 없습니다');
        window.location.href = '/';
    }
});