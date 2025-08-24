public class Main {
    public static void main(String[] args) {
        Valor v = new Valor("Saúde",
        "Atenção Básica", 
        "5119 - ATENCAO PRIMARIA A SAUDE",
        "2E89 - INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS",
        "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS - DESPESAS DIVERSAS",
        2025,
         "Emenda Individual - Transferencias com Finalidade Definida",
        "3913 - ANDRE FERREIRA", 
        "0002", 
        "PERNAMBUCO(UF)",
        "202539130002",
        false, 
        18063994, 
        16123000, 
        16123000,
        0,
        0,
        0);

        Valor v2 = new Valor("Saúde", 
        "Atenção Básica", 
        "5119 - ATENCAO PRIMARIA A SAUDE", 
        "2E89 - INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS", 
        "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS - DESPESAS DIVERSAS",
         2025, 
         "Emenda Individual - Transferencias com Finalidade Definida",
          "2718 - AUGUSTO COUTINHO",
           "0001", 
           "PERNAMBUCO(UF)", 
           "202527180001", 
           false, 
           9000000, 
           8700000, 
           8700000,
            0,
            0,
            0);

            Valor v3 = new Valor(
            "Saúde",
            "Assistencia hospitalar e ambulatoria",
            "5118 - ATENCAO ESPECIALIZADA A SAUDE", 
            "2E89 - INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS", 
            "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS - DESPESAS DIVERSAS",
            2025, 
            "Emenda Individual - Transferencias com Finalidade Definida",
            "2718 - AUGUSTO COUTINHO",
            "0002",
            "PERNAMBUCO(UF)",
            "202527180002",
            false,
            8637991,
           	5617529, 
            5617529, 
            0,
            0,
            0);

        System.out.println("Ano da Emenda: " + v.getAnoEmenda());
        System.out.println("Tipo da Empenhado: " + v.getTipoEmenda());
        System.out.println("Autor da Emenda: " + v.getAutorEmenda());
        System.out.println("Numero da Emenda: " + v.getNumeroEmenda());
        System.out.println("Possui Apoiador?: " + v.getPossuiApoiador());
        System.out.println("Localidade gastos: " + v.getLocalidadeGasto());
        System.out.println("Função: " + v.getFuncao());
        System.out.println("Subfunção: " + v.getSubfuncao());
        System.out.println("Programa Orçamentario: " + v.getProgramaOrcamentario());
        System.out.println("Ação orçamentária: " + v.getAcaoOrcamentaria());
        System.out.println("Plano Orçamentário: " + v.getPlanoOrcamentario());
        System.out.println("Codigo Emenda: " + v.getCodigoEmenda());
        System.out.println("Valor Empenhado: " + v.getValorEmpenhado());
        System.out.println("Valor Liquidado: " + v.getValorLiquidado());
        System.out.println("Valor Pago: " + v.getValorPago());
        System.out.println("Valor Restos a pagar Inscritos: " + v.getValorRestosInscritos());
        System.out.println("Valor restos a pagar Cancelados: " + v.getValorRestosCancelados());
        System.out.println("Valor resrtos a pagar Pagos: " + v.getValorRestosPagos());
        System.out.println();
        System.out.println("SEGUNDA EMENDA");
        System.out.println();
        System.out.println("Ano da Emenda: " + v2.getAnoEmenda());
        System.out.println("Tipo da Empenhado: " + v2.getTipoEmenda());
        System.out.println("Autor da Emenda: " + v2.getAutorEmenda());
        System.out.println("Numero da Emenda: " + v2.getNumeroEmenda());
        System.out.println("Possui Apoiador?: " + v2.getPossuiApoiador());
        System.out.println("Localidade gastos: " + v2.getLocalidadeGasto());
        System.out.println("Função: " + v2.getFuncao());
        System.out.println("Subfunção: " + v2.getSubfuncao());
        System.out.println("Programa Orçamentario: " + v2.getProgramaOrcamentario());
        System.out.println("Ação orçamentária: " + v2.getAcaoOrcamentaria());
        System.out.println("Plano Orçamentário: " + v2.getPlanoOrcamentario());
        System.out.println("Codigo Emenda: " + v2.getCodigoEmenda());
        System.out.println("Valor Empenhado: " + v2.getValorEmpenhado());
        System.out.println("Valor Liquidado: " + v2.getValorLiquidado());
        System.out.println("Valor Pago: " + v2.getValorPago());
        System.out.println("Valor Restos a pagar Inscritos: " + v2.getValorRestosInscritos());
        System.out.println("Valor restos a pagar Cancelados: " + v2.getValorRestosCancelados());
        System.out.println("Valor resrtos a pagar Pagos: " + v2.getValorRestosPagos());
        System.out.println();
        System.out.println("TERCEIRA EMENDA");
        System.out.println();
        System.out.println("Ano da Emenda: " + v3.getAnoEmenda());
        System.out.println("Tipo da Empenhado: " + v3.getTipoEmenda());
        System.out.println("Autor da Emenda: " + v3.getAutorEmenda());
        System.out.println("Numero da Emenda: " + v3.getNumeroEmenda());
        System.out.println("Possui Apoiador?: " + v3.getPossuiApoiador());
        System.out.println("Localidade gastos: " + v3.getLocalidadeGasto());
        System.out.println("Função: " + v3.getFuncao());
        System.out.println("Subfunção: " + v3.getSubfuncao());
        System.out.println("Programa Orçamentario: " + v3.getProgramaOrcamentario());
        System.out.println("Ação orçamentária: " + v3.getAcaoOrcamentaria());
        System.out.println("Plano Orçamentário: " + v3.getPlanoOrcamentario());
        System.out.println("Codigo Emenda: " + v3.getCodigoEmenda());
        System.out.println("Valor Empenhado: " + v3.getValorEmpenhado());
        System.out.println("Valor Liquidado: " + v3.getValorLiquidado());
        System.out.println("Valor Pago: " + v3.getValorPago());
        System.out.println("Valor Restos a pagar Inscritos: " + v3.getValorRestosInscritos());
        System.out.println("Valor restos a pagar Cancelados: " + v3.getValorRestosCancelados());
        System.out.println("Valor resrtos a pagar Pagos: " + v3.getValorRestosPagos());

    }

    
}
