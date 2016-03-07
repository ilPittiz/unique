package unique

import grails.transaction.Transactional

@Transactional
class ClusterService {

    public Cluster createCluster(String name, String slug, boolean flush = false) {
        Cluster cluster = new Cluster(name: name, slug: slug)
        try {
            if(cluster.validate()) {
                cluster.save(flush: flush)
            } else {
                cluster.errors.fieldErrors.each {
                    println('* '+it.field + ' ' +it.defaultMessage + ' '+ it.code+' ' +it.rejectedValue)
                }
            }
        } catch(Exception e) {
            e.printStackTrace()
        }
        return cluster
    }

}
    