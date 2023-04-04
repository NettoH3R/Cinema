public class Principal {
    public static void main(String[] args) {
        
        Filme f = new Filme();
        f.setCodigo(1);
        f.setNome("Gente Grande");
        f.setValor(22);
        f.setDisponivel(true);
    
        if (f.isDisponivel()) {
            System.out.println("\n" + "O filme está disponível." + "\n");
            System.out.println("ID : " + f.getCodigo());
            System.out.println("Nome do filme : " + f.getNome());
            System.out.println("Valor do ingresso : " + f.getValor());
        }else{
            System.out.println("O filme não está disponível.");
        }
    }

}
