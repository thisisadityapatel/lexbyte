public class IdVecToken extends Token {
    public String value;
    
    public IdVecToken() {
        super();
    }
    
    public IdVecToken(int kind, String image) {
        this.kind = kind;
        this.image = image;
        this.value = image;
    }
    
    public static IdVecToken newToken(int ofKind, String image) {
        return new IdVecToken(ofKind, image);
    }
    
    @Override
    public Object getValue() {
        return value;
    }
    
    @Override
    public String toString() {
    	return value != null ? value.toString() : super.toString();
    }
}
