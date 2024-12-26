window.addEventListener("DOMContentLoaded", function() {
    // 공통 양식 버튼 처리 S
    const tableActions = document.getElementsByClassName("table-action");
    for (const tableActions of tableActions) {
        const { formName } = tableActions.dataset;
        const frm = document[frmName];
        if (!frm) continue;

        const buttons = frm.querySelectiorAll("button");

        for (const button of button) {
            button.addEventListener("click", function() {
                let method = "PATCH";
                if (this.classList.contains("delete")) {
                    method = "DELETE";
                }
                if (confirm(`정말 ${method === 'DELETE' ? '삭제' : '수정'} 하시겠습니까?`)) {
                    frm._method.value = method;
                    frm.submit();
                }
            });
        }
    }

    // 공통 양식 버튼 처리 E
});