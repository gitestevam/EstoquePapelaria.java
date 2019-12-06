/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeestoquepapelaria.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controledeestoquepapelaria.dao.ProdutosDAO;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author LAB06-PC002
 */
public class RelatorioDeEstoque {
    private String local;
    private PdfPTable table;
    
    public RelatorioDeEstoque(String local){
        this.local=local;
        this.table=new PdfPTable(3);
    }
    
    public void imprimeTitulo(String linha){
        PdfPCell cellcodigo, cellestoque, celldescricao, celltitulo, cellbranco;
        cellbranco= new PdfPCell(new Paragraph(" "));//Aqui é o espaçamento entre os produtos
        celltitulo= new PdfPCell(new Paragraph(linha, new Font(Font.FontFamily.UNDEFINED, 14, Font.BOLD)));//Aqui altera o tamanho do sub-titulo dos produtos
        cellcodigo= new PdfPCell(new Paragraph("Código", new Font(Font.FontFamily.UNDEFINED, 12, Font.BOLD)));//Aqui altera o tamanho do campo "Código"
        cellestoque= new PdfPCell(new Paragraph("Estoque", new Font(Font.FontFamily.UNDEFINED, 12, Font.BOLD)));//Aqui altera o tamanho do campo "Estoque"
        celldescricao= new PdfPCell(new Paragraph("Descrição", new Font(Font.FontFamily.UNDEFINED, 12, Font.BOLD)));//Aqui altera o tamanho do campo "Descrição"
        celltitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
        celltitulo.setColspan(3);
        celltitulo.setBorder(0  );
        cellcodigo.setHorizontalAlignment(Element.ALIGN_CENTER);
        cellestoque.setHorizontalAlignment(Element.ALIGN_CENTER);
        celldescricao.setHorizontalAlignment(Element.ALIGN_CENTER);
        cellbranco.setColspan(3);
        cellbranco.setBorder(0);
        table.addCell(cellbranco);
        table.addCell(cellbranco);
        table.addCell(celltitulo);
        table.addCell(cellcodigo);
        table.addCell(cellestoque);
        table.addCell(celldescricao);
    }
    
    public void imprimeCorpo(int codigo, int quantidade, String descricao){
        PdfPCell cellcodigo, cellestoque, celldescricao;
        cellcodigo= new PdfPCell(new Paragraph(Integer.toString(codigo)));
        cellestoque= new PdfPCell(new Paragraph(Integer.toString(quantidade)));
        celldescricao= new PdfPCell(new Paragraph(descricao));
        cellcodigo.setHorizontalAlignment(Element.ALIGN_CENTER);
        cellestoque.setHorizontalAlignment(Element.ALIGN_CENTER);
        celldescricao.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cellcodigo);
        table.addCell(cellestoque);
        table.addCell(celldescricao);
    }
    
    public boolean geraRelatorio() throws Exception{
        Document document = new Document();
        try{
            PdfWriter.getInstance(document, new FileOutputStream(local));
            document.open();
            int headerwidhts[]= {12, 12, 76};
            table.setWidths(headerwidhts);
            table.setWidthPercentage(100);
            table.getDefaultCell().setBorder(1);
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            Paragraph t;
            document.add(new Paragraph(" "));
            document.addTitle("Relatório do estoque de produtos");
            document.add(new Paragraph(" "));
            t= new Paragraph("RELATÓRIO DE ESTOQUE PAPELARIA", new Font(Font.FontFamily.UNDEFINED, 16, Font.BOLD));//Aqui é onde motifica o titulo do relatório e o tamanho
            t.setAlignment(Element.ALIGN_CENTER);
            document.add(t);
            document.add(new Paragraph("_______________________________" + "______________________"));//linha que fica embaixo do Titulo
            t= new Paragraph(new Date(). toLocaleString());//Busca a data atual
            t.setAlignment(Element.ALIGN_RIGHT);
            document.add(t);
            ProdutosDAO produtosDAO = new ProdutosDAO();//realiza a conexão com o banco
            ResultSet rs = produtosDAO.buscarTodosProdutos();//guarda  as informações dentro da variavel "ResultSet"
            if(rs != null){//verifica se esta vazio
                while(rs.next()){//faz o loop para pegar todas as informações
                    int codigo = rs.getInt("id");//pega o id e salva em "codigo"
                    String nome = rs.getString("nome");//pega o nome e salva em "nome"
                    String descricao = rs.getString("descricao");//pega o descricao e salva em "descricao"
                    int quantidade = rs.getInt("quantidade");//pega o quantidade e salva em "quantidade"
                    imprimeTitulo(nome);//envia a variavel nome para o metodo "imprimeTitulo"
                    imprimeCorpo(codigo, quantidade, descricao);//envia as variaveis para o metodo "imprimeCorpo"
                }
                
                document.add(table);
                document.add(new Paragraph("_______________________________" + "______________________"));//linha que fica no fim do relatório acima da data
                document.add(new Paragraph(new Date().toLocaleString()));//Busca a data atual
                document.close();
                return true;
            }
            
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        document.close();
        return false;
    }
}
