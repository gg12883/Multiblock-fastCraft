
mods.mekanism.metallurgicInfuser.removeByInput(item('mekanism:ingot', 4),"REDSTONE")


//このコードはレシピを削除するコードです　この方法だとリロードのときにエラーが出ませんが特に問題はなさそうなので上のコードで削除しています。
/*
import mekanism.common.recipe.RecipeHandler
import mekanism.common.recipe.RecipeHandler$Recipe
import mekanism.common.recipe.machines.MetallurgicInfuserRecipe
import mekanism.common.recipe.inputs.InfusionInput
import mekanism.api.infuse.InfuseType


RecipeHandler.removeRecipe(RecipeHandler$Recipe.METALLURGIC_INFUSER,new MetallurgicInfuserRecipe
(new InfusionInput(infusionType("REDSTONE"), 10, item('mekanism:ingot', 4)), item('mekanism:enrichedalloy')))
*/


mods.mekanism.metallurgicInfuser.recipeBuilder()
   .input(item("minecraft:iron_ingot"))
   .amount(10)
   .infuse(infusionType("REDSTONE"))
   .output(item('mekanism:enrichedalloy'))
   .register()
   
