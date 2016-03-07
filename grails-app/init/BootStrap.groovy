import unique.ClusterService

class BootStrap {
    
    ClusterService clusterService

    def init = { servletContext ->
        clusterService.createCluster('Cluster 1', 'cl01')
    }
    
    def destroy = {
    }
}
