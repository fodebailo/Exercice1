public class Produit implements Serializable {
    private Long id;
    private String designation;
    private int quantite;
    private double prix;
    
    public Produit(){
        
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getDesignation(){
        return designation;
    }
    
    public void setDesignation(String designation){
        this.designation = designation;
    }
    
    public double getPrix(){
        return prix;
    }
    
    public void setPrix(double prix){
        this.prix = prix;
    }
    
    public int getQuantite(){
        return quantite;
    }
    
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
}