/**
 * $Id: Controller.java,v 1.5 2004/10/21 02:07:07 tangent_ Exp $
 * @author mike
 *
 * TODO Insert description of this class.
 */

package strangebrew.ui.core;

import strangebrew.Recipe;

public abstract class Controller {

	protected View myView;
	protected Recipe myRecipe;

	
	public Controller(View aView) {
		myView = aView;
		aView.setController(this);
	}
	public abstract void init();
	public abstract void dispose();
	public abstract void execute();
	public abstract void cleanUp();
	public abstract void setRecipe(Recipe aRecipe);
	public Recipe getRecipe() {
		return myRecipe;
	}
	
}
