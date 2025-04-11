import axios from 'axios';

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080/api', // URL do backendu
  timeout: 1000, // opcjonalnie, czas oczekiwania na odpowiedź
  headers: {
    'Content-Type': 'application/json',
  },
});

export default axiosInstance;