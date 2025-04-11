import React, { useEffect, useState } from "react";
import axios from "../api/axios";

interface User {
  id: number;
  name: string;
  email: string;
}

const UserList: React.FC = () => {
  const [users, setUsers] = useState<User[]>([]);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string>("");

  useEffect(() => {
    axios
      .get("/users")
      .then((response) => {
        setUsers(response.data);
        console.log("Otrzymane dane:", response.data); // Dodaj to logowanie
        setLoading(false);
      })
      .catch((error) => {
        console.error("Błąd pobierania użytkowników:", error);
        setError("Błąd podczas pobierania użytkowników.");
        setLoading(false);
      });
  }, []);

  if (loading) {
    return <div>Ładowanie...</div>;
  }

  if (error) {
    return <div>{error}</div>;
  }

  return (
    <div className="p-4">
      <h1 className="text-xl mb-4">Lista użytkowników</h1>
      <ul>
        {users.length > 0 ? (
          users.map((user) => (
            <li key={user.id} className="mb-2">
              {user.name} - {user.email}
            </li>
          ))
        ) : (
          <li>Brak użytkowników</li>
        )}
      </ul>
    </div>
  );
};

export default UserList;
