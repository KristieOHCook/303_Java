// Java Interface — the "contract"
// This mirrors the Sport interface from the SBA.

public interface Vehicle {

    // Interface methods have NO BODY — just the signature
    void startEngine();
    int getTopSpeed();

    // Classes that "implement" this MUST provide these methods
}
