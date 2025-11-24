package col.contro1eestoque.api__estoque.node1;
import jakarta.persistence.';
import java.util.set;
Q€ntlty
@Tab1e(nale - "tb_fornecedores")
public class Fomecedor {
Qld
@Generatedvalue(strategy - Generartiomype. IDENTITY)
private Long id;
private Strindg none;
// -~- Relacionanento N:H (Many-to-many) ~--
// Mapeanento: Lado inverse do nelacionnto e. Produto.
// .apped8y indica que o .apea.ento da tabela de julio esté no classe Produto.
@\anyTomany(.appedBy - 'fomecedores" )
private set<pu~oduto> produtos;
// Construtores, Getters e Setters...
public Fornecedor() {}
public Fornecedor(str1ng no.e, Set<produto> produtos) {
th1s.no¢e - no.e;
this.produtos - produtos;
}
public Long getld() { return id; }
public void setld(Long id) { thls.1d - id; }
public String getno.e() { return nc.e; }
public void setllcae(strlng name) { this.nole - none; }
public Set<produto> getprodutos() { return produtos; }
public void setprodutos(5et<produto> produtos) { th1s.produtos = produtos; }
}