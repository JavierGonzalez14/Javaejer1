$(document).ready( function(){  //Entra hasta que la pagina se cargo
      var arregloDeObjetos = []; //Guardar post

      //Validar click guardar post
      $("button#add-post") //Selector
      .on( //Metodo On
        "click",  //Evento a manejar
        function ( event ) { //Funcion manejadora

        var postText = $("textarea#textoPost").val(); //Devuelve un string
        postText =$.trim(postText); //Quitamos espacios en blanco en los extremos y en las orillas  
        
        if(postText !== ""){
            console.log($("div.mi-post").length + 1);
            var nuevoPost={
              //numero: arregloDeObjetos.length + 1,
              numero: $("div.mi-post").length + 1,
              Contenido: postText
            };
            console.log(arregloDeObjetos);
            //arregloDeObjetos[arregloDeObjetos.length] = nuevoPost;

            //Obtiene contenido html
            var html =$("div#posts").html();

            $("div#posts").prepend(
              '<div id="mi-post-' + nuevoPost.numero + '" class="container mi-post">'+

              '<div class="row">'+
                 '<div class="col-4">'+
                    '<img src="img/author1.jpeg">'+
                 '</div>'+
                 '<div class="col-4">'+
                    'Texto 1<br>'+
                     'Texto 2'+
                 '</div>'+
                 '<div class="col-2">'+
                    '<b>POST '+ nuevoPost.numero + '</b>'+
                 '</div>'+
                 '<div class="col-1">'+
                 '<button class="btn btn-outline-danger btn-sm    post-delete" data-numero="' + nuevoPost.numero + '">&times;</button>'+
              '</div>'+
              '</div>'+
            '<div class="row">'+
                 '<div class="col-12">'+
                          postText+
                 '</div>'+
              '</div>'+
          '</div>'

        );
          $("textarea#textoPost").val(""); //Limpiar caja de texto
          //$("button#close-post").click(); //Clickear boton cerrar opcion cerrar 1
          $("div#exampleModal").modal("hide"); //Se esconde ventana opcion cerrar 2
          }
          else {
            alert("Escriba algo");
          } //Nuestro nuevo post


        });
        $("div#posts") //En que contenedor lo vamos a buscar, en donde se inyecto
         .on(
           "click", //Evento a validar
           "button.post-delete", //Boton elemento a validar
           function (event){  //Funcion manejadora
              console.log("Ya te vas a ir");
                //$("div.mi-post").remove(); //Borrar las publicaciones
                //$(this).parent()

                if(confirm("Estas seguro?")){
                var numero = $(this).data("numero"); //Nos traemos el atributo data-numero, this: es para el boton actual
                
                var miId = "div#mi-post-" + numero;
                console.log(miId);
                $(miId).remove();
              }
           });
});
