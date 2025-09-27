public class IdBoolToken extends Token {
    public String value;
    
    public IdBoolToken() {
        super();
    }
    
    public IdBoolToken(int kind, String image) {
        this.kind = kind;
        this.image = image;
        this.value = image;
    }
    
    public static IdBoolToken newToken(int ofKind, String image) {
        return new IdBoolToken(ofKind, image);
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
