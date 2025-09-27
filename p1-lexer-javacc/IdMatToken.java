public class IdMatToken extends Token {
    public String value;
    
    public IdMatToken() {
        super();
    }
    
    public IdMatToken(int kind, String image) {
        this.kind = kind;
        this.image = image;
        this.value = image;
    }
    
    public static IdMatToken newToken(int ofKind, String image) {
        return new IdMatToken(ofKind, image);
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
