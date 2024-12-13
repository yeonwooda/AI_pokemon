package org.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass // 엔티티 중에서 공유하는 공통 속성으로 하는 상위 클래스를 알려주는 (날짜와 시간)
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseMemberEntity extends BaseEntity { // BaseMemberEntity 사용정보에 뭘 넣을지 결정?

    @CreatedBy
    @Column(length=65, updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(length=65, insertable = false)
    private String modifiedBy;
}
