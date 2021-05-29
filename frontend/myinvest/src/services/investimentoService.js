import axios from "axios";

const API_URL = "http://localhost:8080"

class InvestimentoService {
    retrieveAllInvestimentos() {
        return axios.get(`${API_URL}/invetimentos`)
    }

    saveInvestimento(investimento) {
        return axios.post(`${API_URL}/invetimentos`, investimento)
    }

    deleteInvestimento(codigo) {
        return axios.delete(`${API_URL}/invetimentos/codigo`)
    }

}

export default new InvestimentoService();