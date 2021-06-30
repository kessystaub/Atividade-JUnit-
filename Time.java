
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class Time {
    public String nome;    
    public Goleiro goleiro;
    private ArrayList<Defensor> defensores= new ArrayList<Defensor>();
    private ArrayList<Atacante> atacantes= new ArrayList<Atacante>();
    private int vitorias;
    private int empates;
    private int derrotas;
    private boolean visita;
    
    public Time(String nome){
        this.nome=nome;
        this.vitorias=0;
        this.empates=0;
        this.derrotas=0;
    }
    
    public void adicionarDefensor(Defensor defensor){
        if(this.defensores.size()>2){
            System.out.println("Ja existem mais de dois defensores");
        }else{
            this.defensores.add(defensor);
        }
    }
    
    public void adicionarAtacante(Atacante atacante){
        if(this.atacantes.size()>2){
            System.out.println("Ja existem mais de dois atacantes");
        }else{
            this.atacantes.add(atacante);
        }
    }
    
    public void adicionarGoleiro(Goleiro goleiro){
        if(this.goleiro!=null){
            System.out.println("Ja existe um goleiro na equipe");
        }else{
            this.goleiro=goleiro;
        }
    }    
        
    public ArrayList<Defensor> getDefensores(){
        return defensores;
    } 
    
    public ArrayList<Atacante> getAtacantes(){
        return atacantes;
    }
    
    public int resultados(){
        int result=0;
        
        result += (this.vitorias*3)+(this.empates);
        return result;
    }

    public boolean visitante(){
        return this.visita;
    }
    
}
