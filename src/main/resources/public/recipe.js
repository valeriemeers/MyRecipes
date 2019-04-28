const url="http://localhost:8080/create";
$(function(){
    $.getJSON(url,function(response, status){
        if(status==="succes"){
            var r="";
            $.each(response, function (i, recipe) {
                r+= "name: "+recipe.name +
                    "description: "+recipe.description +
                    "course:" +recipe.course+
                    "category: "+recipe.category +
                    "level:" +recipe.level +
                    "kitchen: "+recipe.kitchen +
                    "source:" +recipe.source +
                    "servingsize:"+recipe.servingSize+
                    "evaluation:" +recipe.evaluation

                    "<br>";
            });

            $("#result").html(r);
        }
    });
});