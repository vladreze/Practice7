package Practice7New;

public record Order(long id, String userEmail, int totalCents) {
    public Order{
        if(id <= 0){
            throw new IllegalArgumentException("ID має бути більше нуля");
        }
        if(userEmail.isBlank() || !userEmail.contains("@")){
            throw new IllegalArgumentException("EMAIL неправильний формат");
        }
        if(totalCents < 0 ){
            throw new IllegalArgumentException("TOTALCENTS має бути від 0");
        }
    }
}
