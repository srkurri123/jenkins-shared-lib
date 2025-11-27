def call(String environment = "dev") {
    echo "=== [Shared Lib] Deploying to environment: ${environment} ==="

    // Again, just a dummy placeholder.
    echo "Pretend: kubectl apply -f deployment-${environment}.yaml"
}
