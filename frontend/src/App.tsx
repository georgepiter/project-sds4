import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <div className="container">
        <h1 className="text-primary">TESTE</h1>
        <NavBar />
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
