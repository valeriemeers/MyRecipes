<!doctype html>

<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">

    <body>
        <div class="container">
            <p>Enter a new recipe</p>
            <div>
                <form action="/create" method="post" >

                    <div class="container">
                        <div class="row">
                            <div class="col col-lg-4">
                                <div class="form-group">
                                    <label for="inputName">Enter recipe name:</label>
                                    <input type="text" class="form-control" id="inputName" name="name" placeholder="Coconut cream pie">
                                </div>
                            </div>
                            <div class="col-lg-2"></div>
                            <div class="col col-lg-4">
                                <div>Rate this recipe:</div>
                                <div class="form-check form-check-inline">
                                    <!--name="inlineRadioOptions"-->

                                    <input class="form-check-input" type="radio" name="evaluation" id="inlineRadio1" value="option1">
                                    <label class="form-check-label" for="inlineRadio1">1</label>&nbsp;&nbsp;
                                    <input class="form-check-input" type="radio" name="evaluation" id="inlineRadio2" value="option2">
                                    <label class="form-check-label" for="inlineRadio2">2</label>&nbsp;&nbsp;
                                    <input class="form-check-input" type="radio" name="evaluation" id="inlineRadio3" value="option3">
                                    <label class="form-check-label" for="inlineRadio3">3</label>&nbsp;&nbsp;
                                    <input class="form-check-input" type="radio" name="evaluation" id="inlineRadio4" value="option4">
                                    <label class="form-check-label" for="inlineRadio4">4</label>&nbsp;&nbsp;
                                    <input class="form-check-input" type="radio" name="evaluation" id="inlineRadio5" value="option5">
                                    <label class="form-check-label" for="inlineRadio5">5</label>&nbsp;&nbsp;
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col col-lg-6">
                                <label for="inputDescription">Describe recipe:</label>
                                <textarea class="form-control" id="inputDescription" rows="1" name="description"></textarea>
                            </div>
                            <div class="col col-lg-5">
                                <label for="inputSouce">Tell us where you found this recipe and who created it:</label>
                                <input type="text" class="form-control" id="inputSouce" name="source" placeholder="Chef's name/url website/title cookbook">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col col-lg-2">
                                <label for="inputCourse">Select course:</label>
                                <select class="form-control" id="inputCourse" name="course">
                                    <option>Breakfast</option>
                                    <option>Lunch</option>
                                    <option>Dinner</option>
                                    <option>Desserts</option>
                                    <option>Snacks</option>
                                </select>
                            </div>
                            <div class="col col-lg-2">
                                <label for="inputCategory">Select category:</label>
                                <select class="form-control" id="inputCategory" name="category">
                                    <option>Bread</option>
                                    <option>Cake</option>
                                    <option>Pie</option>
                                    <option>Muffin</option>
                                    <option>Smoothie</option>
                                    <option>Juice</option>
                                    <option>Frosting</option>
                                    <option>Sauce</option>
                                </select>
                            </div>
                        </div>

                        <br>
                        <div class="row">
                            <div class="col col-lg-2">
                                <label for="inputLevel">Select difficulty:</label>
                                <select class="form-control" id="inputLevel" name="level">
                                    <option>Super easy</option>
                                    <option>Not too tricky</option>
                                    <option>Showing off</option>
                                </select>
                            </div>
                            <div class="col col-lg-2">
                                <label for="inputKitchen">Select kitchen:</label>
                                <select class="form-control" id="inputKitchen" name="kitchen">
                                    <option>---</option>
                                    <option>Italian</option>
                                    <option>Indian</option>
                                    <option>Vegan</option>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col col-lg-2">
                                <label for="inputPrepTime">Preparation time:</label>

                            </div>
                            <div class="col col-lg-2">
                                <label for="inputCookTime">Cooking time:</label>

                            </div>
                            <div class="col col-lg-2">
                                <label for="inputServingSize">Serving size:</label>

                            </div>
                        </div>
                        <div class="row">
                            <div class="col col-lg-1">
                                <input type="text" class="form-control" id="inputPrepTime" placeholder="15" name="prepTime"> minutes.
                            </div>
                            <div class="col col-lg-1"></div>
                            <div class="col col-lg-1">
                                <input type="text" class="form-control" id="inputCookTime" placeholder="30" name="cookTime"> minutes.
                            </div>
                            <div class="col col-lg-1"></div>
                            <div class="col col-lg-1">
                                <input type="text" class="form-control" id="inputServingSize" placeholder="4" name="servingSize">
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="col-lg-5">
                                <label for="inputIngredients">Enter ingredients:</label>
                                <textarea class="form-control" id="inputIngredients" rows="5" name="ingredient"></textarea>
                            </div>
                            <div class="col">
                                <label for="inputInstructions">Enter instructions:</label>
                                <textarea class="form-control" id="inputInstructions" rows="8" name="instruction"></textarea>
                            </div>
                        </div>


                    </div>
            
                    <input class="btn btn-primary" type="submit" value="Submit">

                </form>




                <!-- Optional JavaScript -->
                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
                    crossorigin="anonymous"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
                    crossorigin="anonymous"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
                    crossorigin="anonymous"></script>
                <!--<script src="recipe.js"></script>-->
            </div>
        </div>
</body>

</html>