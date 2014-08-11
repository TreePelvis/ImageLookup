package ss.simpleimagelookup;

public interface ImageLookupModelInterface {

	void setImage(String imageName);
	
	String getImageName();
	
	void registerObserver(ImageObserver o);
	
	void removerObserver(ImageObserver o);
}
