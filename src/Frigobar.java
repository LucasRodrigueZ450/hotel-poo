import java.util.Arrays;

class Frigobar {
    private String[] itens;

    public Frigobar(String[] itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Frigobar itens=" + Arrays.toString(itens);
    }

    public boolean contemItem(String item) {
        for (String i : itens) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void removerItem(String item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i].equals(item)) {
                itens[i] = null;
                break;
            }
        }
    }
}
