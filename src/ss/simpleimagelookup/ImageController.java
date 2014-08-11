package ss.simpleimagelookup;

public class ImageController implements ControllerInterface {

	ImageLookupModelInterface model;
	ImageView view;
	
	public ImageController(ImageLookupModelInterface model) {
		this.model = model;
		view = new ImageView(this, model);
		view.creatView();
		view.createControls();
	}
	
	@Override
	public void setImage(String imageName) {
		model.setImage(imageName);
	}

	@Override
	public void lookupImage() {
		
	}

}
