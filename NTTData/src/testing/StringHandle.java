package testing;

public class StringHandle {
	public String caseChange(String str) {
		return str.toUpperCase();
	}

	public String reverseString(String str) {

		StringBuffer bstr = new StringBuffer(str);
		bstr.reverse();
		return bstr.toString();
	}

}
