package crazypants.enderio.jei;

public class RecipeHandler<T extends RecipeWrapper> extends  BaseRecipeHandler<T> {

  public RecipeHandler(Class<T> clazz, String uid) { 
    super(clazz, uid);    
  }

  @Override
  public boolean isRecipeValid(T recipe) {
    return recipe.isValid();
  }

}