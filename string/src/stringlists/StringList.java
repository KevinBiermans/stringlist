package stringlists;

import java.util.Arrays;

/**
 * Each instance of this class represents a sequence of strings.
 */
public class StringList {
	
	private String[] elements;
	
	public String[] getElements() {return elements; }
	
	public String getConcatenation() {
		if (elements.length ==0)
			return "";
		else {
			String result = elements[0];
			for (int i=1; i< elements.length; i++)
				result= result.concat(elements[i]);
			return result;
		}
	}
	
	public StringList(String[] elements) {
		if (elements == null)
			throw new IllegalArgumentException("The given array must not be null.");
		if (Arrays.stream(elements).anyMatch(e -> e == null))
			throw new IllegalArgumentException("The elements must not be null.");
		this.elements = elements.clone(); // moet clone zijn, representatie object is een kopie van het meegegeven object 
											//en wordt dus niet gewijzigd door de klant
	}

	public void setElement(int index, String value) {
		if (value==null)
			throw new IllegalArgumentException("Given value must not be null.");
		elements[index] = value;
	}
}
