package com.crsardar.sprinjparest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "assets", path = "assets")
public interface AssetsRepository extends PagingAndSortingRepository<Assets, Long> {
}
