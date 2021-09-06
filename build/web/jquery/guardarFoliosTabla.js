/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

jQuery(document).on('submit', '#formfolios', function (event) {
    event.preventDefault();
    
    var arrData = [];
    // loop over each table row (tr)
    $("#tablita tr").each(function () {
        var currentRow = $(this);
        var col2_value = currentRow.find("td:eq(1)").text();
        
        arrData.push({folios:col2_value});
    });
    
    console.log(arrData);
    jQuery.ajax({
        url: '../guardarTabla',
        type: 'POST',
        dataType: 'json',
        data: {'array': JSON.stringify({ Folios: arrData })},//capturo array    
        beforeSend: function () {
            $('#guardarFolios').val('Enviando');
        }
    }).done(function (response) {
        console.log(response);

        if (!response.error) {

            //Falta colocar notificacion
            ShowAlert(1, response.errorType, 50000)

            $("#scanner").load(" #scanner  > *");
            $('#guardarFolios').val('Enviar');
        } else {
            $('.alert').removeClass("hide");
            $('.alert').addClass("show");
        }

    }).fail(function (response) {
        console.log(response);
    });
});