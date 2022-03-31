package br.darlianemendes.padroesFactory;

    public class MoedaFactory {
        public static Moeda criarMoeda(Pais pais){
            if(pais.equals(Pais.BRASIL)){
                return (Moeda) new Moeda.Real();
            } if (pais.equals(Pais.EUA)){
                return (Moeda) new Moeda.Dolar();
            }
            throw new IllegalArgumentException("Não existe esse pais");
        }

    }
