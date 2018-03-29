function funcPageOnload(){
    $('#exampleModal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) // Button that triggered the modal
        var recipient = button.data('whatever') // Extract info from data-* attributes
        // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
        // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
        var modal = $(this)
        modal.find('.modal-title').text('New message to ' + recipient)
    })

    /**
     * 留言表单提交方法
     */
    $("#newMsgSubmit").on("click",function () {
        $("#newMsg").ajaxSubmit({
            beforeSubmit: function () {
                // alert("我在提交表单之前被调用！");
            },
            success: function (data) {
                //alert("我在提交表单成功之后被调用");
                if (data != null && data.success != null && data.success == true) {
                    $('#exampleModal').modal('hide');
                    location.reload();
                } else {
                }

            }
        });
    });
}


