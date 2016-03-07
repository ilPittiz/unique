package unique

import grails.converters.JSON

class ClusterController {

    ClusterService clusterService
    
    def index() {
        clusterService.createCluster('Cluster 2', 'cl02')
        def map = [ clusters: Cluster.list().collect { [ id: it.id, name: it.name, slug: it.slug ] } ]
        render map as JSON
    }
    
}
