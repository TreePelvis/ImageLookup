package ss.simpleimagelookup;

import java.util.ArrayList;

public class ImageLookupModel implements ImageLookupModelInterface {
	
	ArrayList<ImageObserver> imageObservers = new ArrayList<ImageObserver>();
	String imageName = "CAT.jpg";
	
	public void setImage(String imageName) {
		this.imageName = imageName;
		notifyImageObservers();
	}

	private void notifyImageObservers() {
		for(int i = 0; i < imageObservers.size(); i++) {
			ImageObserver observer = imageObservers.get(i);
			observer.updateImage();
		}
	}

	public String getImageName() {
		return imageName;
	}

	public void registerObserver(ImageObserver o) {
		imageObservers.add(o);
	}

	public void removerObserver(ImageObserver o) {
		int i = imageObservers.indexOf(o);
		if(i>=0)
			imageObservers.remove(o);
	}
}
