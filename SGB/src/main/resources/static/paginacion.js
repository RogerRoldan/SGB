$(document).ready(function() {
    $('#example').DataTable({
        responsive: true,
        "language": {
        "lengthMenu": "Mostrar _MENU_  Registros por Página",
        "zeroRecords": "Nada encontrado - Disculpa",
        "info": "Mostrando la Página _PAGE_ de _PAGES_",
        "infoEmpty": "No hay registros disponibles",
        "infoFiltered": "(filtrado de _MAX_ registros totales)",
        'search': 'Buscar:',
        'paginate':{
            'next': 'Siguiente',
            'previous': 'Anterior'
        }
    }
        
    });
} );  