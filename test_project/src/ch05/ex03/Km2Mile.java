package ch05.ex03;

public class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) 
	{
		return src/ratio;
	}

	@Override
	protected String srcString() {
		return "KM";
	}

	@Override
	protected String destString() {
		return "MILE";
	}

}
