import request from '@/utils/request'

// 查询人事档案花名册列表
export function listArchives(query) {
  return request({
    url: '/personnel/archives/list',
    method: 'get',
    params: query
  })
}

// 查询人事档案花名册详细
export function getArchives(id) {
  return request({
    url: '/personnel/archives/' + id,
    method: 'get'
  })
}

// 新增人事档案花名册
export function addArchives(data) {
  return request({
    url: '/personnel/archives',
    method: 'post',
    data: data
  })
}

// 修改人事档案花名册
export function updateArchives(data) {
  return request({
    url: '/personnel/archives',
    method: 'put',
    data: data
  })
}

// 删除人事档案花名册
export function delArchives(id) {
  return request({
    url: '/personnel/archives/' + id,
    method: 'delete'
  })
}
